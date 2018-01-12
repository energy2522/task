FROM custom/hadoop

ENV HDFS_CONF_dfs_datanode_data_dir=file:///hadoop/dfs/data
RUN mkdir -p /hadoop/dfs/data
RUN mkdir -p /sys
VOLUME /hadoop/dfs/data

ADD run.sh /run.sh
ADD create-folder.sh /create-folder.sh
RUN chmod a+x /run.sh
RUN chmod a+x /create-folder.sh

COPY data/* /local/data/

CMD ["/run.sh", " && ", "/create-folder.sh"]
