#!/bin/bash

mkdir /hdfs

hdfs dfs -mkdir /hdfs


hdfs dfs -put /local/data/* /hdfs

echo create hdfs folder!!!!!
