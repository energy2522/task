#!/bin/bash

sudo docker build -t datanode datanode/
sudo docker build -t namenode namenode/
sudo docker build -t nodemanager nodemanager/
sudo docker build -t resourcemanager resourcemanager/
sudo docker build -t spark spark/

