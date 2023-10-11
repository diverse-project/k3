#!/bin/bash
# Check if KEY_FILE argument was provided
if [ $# -eq 0 ]
  then
    echo "Please provide the path to the SSH key file as an argument."
    exit 1
fi

set -x

WORKSPACE=$(pwd)
UPDATESITE_REPOSITORY="${WORKSPACE}/k3.eclipse/fr.inria.diverse.k3.p2updatesite/target/repository"
DEPLOY_SERVER="kermeta.org"
DEPLOY_USER="web-kermeta"
DEPLOY_PATH="/home/web/apache/sites/kermeta.org/htdocs/k3"
TODAY_UK=$(date +%Y-%m-%d)
KEY_FILE="$1"

chmod -R g+w "${UPDATESITE_REPOSITORY}"

ssh -i "${KEY_FILE}" "${DEPLOY_USER}@${DEPLOY_SERVER}" "rm -Rf ${DEPLOY_PATH}/update; \
mkdir ${DEPLOY_PATH}/update; \
rm -Rf ${DEPLOY_PATH}/update_${TODAY_UK}; \
mkdir ${DEPLOY_PATH}/update_${TODAY_UK};"

echo "Uploading to ${DEPLOY_SERVER}:${DEPLOY_PATH}/update"
scp -r -i "${KEY_FILE}" "${UPDATESITE_REPOSITORY}"/* "${DEPLOY_USER}@${DEPLOY_SERVER}:${DEPLOY_PATH}/update"

echo "Uploading to ${DEPLOY_SERVER}:${DEPLOY_PATH}/update_${TODAY_UK}"
scp -r -i "${KEY_FILE}" "${UPDATESITE_REPOSITORY}"/* "${DEPLOY_USER}@${DEPLOY_SERVER}:${DEPLOY_PATH}/update_${TODAY_UK}"