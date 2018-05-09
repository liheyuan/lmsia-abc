#!/bin/bash

MANAGEMENT_PORT=8081

curl -X POST localhost:${MANAGEMENT_PORT}/shutdown
