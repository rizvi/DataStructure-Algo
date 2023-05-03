package com.apriori;
/*
	Java implementation of the Apriori Algorithm

	SQL Queries for database:
	CREATE TABLE apriori(transaction_id int, object int);

	INSERT INTO apriori VALUES(1, 1);
	INSERT INTO apriori VALUES(1, 3);
	INSERT INTO apriori VALUES(1, 4);
	INSERT INTO apriori VALUES(2, 2);
	INSERT INTO apriori VALUES(2, 3);
	INSERT INTO apriori VALUES(2, 5);
	INSERT INTO apriori VALUES(3, 1);
	INSERT INTO apriori VALUES(3, 2);
	INSERT INTO apriori VALUES(3, 3);
	INSERT INTO apriori VALUES(3, 5);
	INSERT INTO apriori VALUES(4, 2);
	INSERT INTO apriori VALUES(4, 5);

*/

import java.util.*;
import java.sql.*;

class Tuple {
	Set<Integer> itemset;
	int support;

	Tuple() {
		itemset = new HashSet<>();
		support = -1;
	}

	Tuple(Set<Integer> s) {
		itemset = s;
		support = -1;
	}

	Tuple(Set<Integer> s, int i) {
		itemset = s;
		support = i;
	}
}

class Apriori {
	static Set<Tuple> candidates;
	static Set<Tuple> levels;
	static int data[][];
	static int min_support;

	public static void main(String args[]) throws Exception {
		getDatabase();
		candidates = new HashSet<>();
		levels = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		int i, j;
		System.out.println("Enter the minimum support (as an integer value):");
		min_support = scan.nextInt();
		Set<Integer> candidate_set = new HashSet<>();
		for (i = 0; i < data.length; i++) {
			System.out.println("Transaction Number: " + (i + 1) + ":");
			for (j = 0; j < data[i].length; j++) {
				System.out.print("Item number " + (j + 1) + " = ");
				System.out.println(data[i][j]);
				candidate_set.add(data[i][j]);
			}
		}

		Iterator<Integer> iterator = candidate_set.iterator();
		while (iterator.hasNext()) {
			Set<Integer> s = new HashSet<>();
			s.add(iterator.next());
			Tuple t = new Tuple(s, count(s));
			candidates.add(t);
		}

		prune();
		generateFrequentItemsets();
	}

	static int count(Set<Integer> s) {
		int i, k;
		int support = 0;
		int count;
		boolean containsElement;
		for (i = 0; i < data.length; i++) {
			count = 0;
			Iterator<Integer> iterator = s.iterator();
			while (iterator.hasNext()) {
				int element = iterator.next();
				containsElement = false;
				for (k = 0; k < data[i].length; k++) {
					if (element == data[i][k]) {
						containsElement = true;
						count++;
						break;
					}
				}
				if (!containsElement) {
					break;
				}
			}
			if (count == s.size()) {
				support++;
			}
		}
		return support;
	}

	static void prune() {
		levels.clear();
		Iterator<Tuple> iterator = candidates.iterator();
		while (iterator.hasNext()) {
			Tuple t = iterator.next();
			if (t.support >= min_support) {
				levels.add(t);
			}
		}
		System.out.println("-********** Level wise data **********-");
		for (Tuple t : levels) {
			System.out.println(t.itemset + " : " + t.support);
		}
	}

	static void generateFrequentItemsets() {
		boolean toBeContinued = true;
		int element = 0;
		int size = 1;
		Set<Set> candidate_set = new HashSet<>();
		while (toBeContinued) {
			candidate_set.clear();
			candidates.clear();
			Iterator<Tuple> iterator = levels.iterator();
			while (iterator.hasNext()) {
				Tuple t1 = iterator.next();
				Set<Integer> temp = t1.itemset;
				Iterator<Tuple> it2 = levels.iterator();
				while (it2.hasNext()) {
					Tuple t2 = it2.next();
					Iterator<Integer> it3 = t2.itemset.iterator();
					while (it3.hasNext()) {
						try {
							element = it3.next();
						} catch (ConcurrentModificationException e) {
							// Sometimes this Exception gets thrown, so simply break in that case.
							break;
						}
						temp.add(element);
						if (temp.size() != size) {
							Integer[] int_arr = temp.toArray(new Integer[0]);
							Set<Integer> temp2 = new HashSet<>();
							for (Integer x : int_arr) {
								temp2.add(x);
							}
							candidate_set.add(temp2);
							temp.remove(element);
						}
					}
				}
			}
			Iterator<Set> candidate_set_iterator = candidate_set.iterator();
			while (candidate_set_iterator.hasNext()) {
				Set s = candidate_set_iterator.next();
				// These lines cause warnings, as the candidate_set Set stores a raw set.
				candidates.add(new Tuple(s, count(s)));
			}
			prune();
			if (levels.size() <= 1) {
				toBeContinued = false;
			}
			size++;
		}
		System.out.println("\n=************ FINAL LIST *******************=");
		for (Tuple t : levels) {
			System.out.println(t.itemset + " : " + t.support);
		}
	}

	private static final String CONNECTION = "jdbc:mysql://localhost:3306/apriori-db?autoReconnect=true&verifyServerCertificate=false&useSSL=false";

	static void getDatabase() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Properties for user and password. Here the user rizvi and password Bjit1234@#$
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "Bjit1234@#$");

		Connection con = DriverManager.getConnection(CONNECTION, prop);
		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("SELECT * FROM apriori;");
		Map<Integer, List<Integer>> mapData = new HashMap<>();
		List<Integer> temp;
		while (rs.next()) {
			int list_no = Integer.parseInt(rs.getString(1));
			int object = Integer.parseInt(rs.getString(2));
			temp = mapData.get(list_no);
			if (temp == null) {
				temp = new LinkedList<>();
			}
			temp.add(object);
			mapData.put(list_no, temp);
		}

		Set<Integer> keySet = mapData.keySet();
		data = new int[keySet.size()][];
		Iterator<Integer> iterator = keySet.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			temp = mapData.get(iterator.next());
			Integer[] int_arr = temp.toArray(new Integer[0]);
			data[count] = new int[int_arr.length];
			for (int i = 0; i < data[count].length; i++) {
				// loading data from db
				data[count][i] = int_arr[i].intValue();
			}
			count++;
		}
	}
}