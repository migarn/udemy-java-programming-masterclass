package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,1.5));
    }
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;
        int neededBuckets = 0;
        if (width * height - areaPerBucket * extraBuckets > 0)
            neededBuckets = (int) Math.ceil(getBucketCount(width * height - areaPerBucket * extraBuckets,areaPerBucket));
        return neededBuckets;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;
        int neededBuckets = (int) Math.ceil(getBucketCount(width * height,areaPerBucket));
        return neededBuckets;
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0)
            return -1;
        int neededBuckets = (int) Math.ceil(area / areaPerBucket);
        return neededBuckets;
    }
}
