package com.mit.du.randomforest.tasks;

import com.mit.du.randomforest.classifier.RandomForest;
import com.mit.du.randomforest.datasets.DataSet;
import com.mit.du.randomforest.datasets.Instance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RandomForestTask {

    private static final String TRAIN_DATA = "D:\\workspace\\DataStructure-Algo\\src\\main\\resources\\random-forest\\spine.csv";

    /**
     * args[0] = fold or dataset, e.g. train
     * args[1] = fold or dataset, e.g. test
     * args[2] = n_estimators
     * args[3] = max_features
     * args[4] = min_samples_leaf
     */
    public static void main(String[] args) throws IOException {
        RandomForestTask irisTask = new RandomForestTask();

        int estimators = args.length >= 3 ? Integer.parseInt(args[2]) : 100;
        int maxFeatures = args.length >= 4 ? Integer.parseInt(args[3]) : 8;
        int minSamplesLeaf = args.length >= 5 ? Integer.parseInt(args[4]) : 1;

        String pathForTrain = "D:\\workspace\\DataStructure-Algo\\src\\main\\resources\\random-forest\\train.csv";
        String pathForTest = "D:\\workspace\\DataStructure-Algo\\src\\main\\resources\\random-forest\\test.csv";
        Pair<List<double[]>, List<Integer>> trainData = irisTask.getData(pathForTrain);
        Pair<List<double[]>, List<Integer>> testData = irisTask.getData(pathForTest);

        DataSet train = new DataSet(trainData.first, trainData.second);
        DataSet test = new DataSet(testData.first, testData.second);

        RandomForest rf = new RandomForest(new DataSet(train.getTrainingData()), estimators, maxFeatures, minSamplesLeaf);

        int correct = 0;
        int total = 0;
        for (int i = 0; i < test.getSize(); i++){
            Instance sample = test.getInstance(i);
            int predictLabel = rf.predictLabel(sample.getFeatureVector());
            if (sample.getLabelIndex() == predictLabel) {
                correct++;
            }
            total++;
        }

        System.out.println(((double) correct / total));
    }

    private Pair<List<double[]>, List<Integer>> getData(String path) throws IOException {
//        System.out.println("read dataset from " + path);

        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            int count = -1;
            List<double[]> samples = new ArrayList<>();
            List<Integer> labels = new ArrayList<>();

            String input;
            while ((input = in.readLine()) != null) {
                count++;

                String[] features = input.split(",");
                double[] sample = new double[features.length - 1];
                for (int i = 0; i < features.length - 1; i++){
                    sample[i] = Double.parseDouble(features[i]);
                }
                samples.add(sample);

                labels.add(Integer.parseInt(features[features.length - 1]));
            }
            return new Pair<>(samples, labels);
        }
    }

    private static class Pair<K, V> {
        K first;
        V second;

        public Pair(K first, V second) {
            this.first = first;
            this.second = second;
        }
    }

}
