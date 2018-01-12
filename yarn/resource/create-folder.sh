#!/bin/bash

mkdir /hdfs

hdfs dfs -mkdir /hdfs


hdfs dfs -put /resources/data/* /hdfs

echo create hdfs folder!!!!!
