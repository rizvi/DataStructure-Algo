package com.rizvi;

/**
 * @author Rizvi on 2/3/2020
 * @project DataStructure-Algo
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	int minimumDays(int rows, int columns, List<List<Integer>> grid) {
		// WRITE YOUR CODE HERE
//		String[][] gridArray = grid.stream().map(l -> l.stream().toArray(String[]::new)).toArray(String[][]::new);
		Integer[][] gridArray = grid.stream().map(l -> l.toArray(new Integer[l.size()])).toArray(Integer[][]::new);
		Queue<int[]> q = new LinkedList<>();
		int target = gridArray.length * gridArray[0].length;
		int count = 0;
		int res = 0;

		for (int i = 0; i < gridArray.length; i++) {
			for (int j = 0; j < gridArray[0].length; j++) {
				if (gridArray[i][j] == 1) {
					q.offer(new int[]{i, j});
					count++;
				}
			}
		}

		int[][] dirs = {
				{0, 1},
				{0, -1},
				{1, 0},
				{-1, 0}
		};

		while (!q.isEmpty()) {
			int queueSize = q.size();
			if(count == target) {
				return res;
			}

			for (int i=0; i<queueSize; i++) {
				int[] cur = q.poll();

				for(int[] dir: dirs) {
					int ni = cur[0] + dir[0];
					int nj = cur[1] + dir[1];
					if(ni >=0 && ni < gridArray.length && nj>=0 && nj<gridArray[0].length && gridArray[ni][nj]==0){
						count++;
						q.offer(new int[] {ni, nj});
						gridArray[ni][nj] = 1;
					}
				}
			}
			res++;
		}
		return -1;
	}
	// METHOD SIGNATURE ENDS

}
