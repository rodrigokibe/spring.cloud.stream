#!/usr/bin/env bash
docker stop rabbitmq
docker rm rabbitmq
docker-compose -f rabbitmq.yml up -d
