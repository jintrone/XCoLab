#!/bin/bash

#git pull origin master
git pull origin jenkins-tests

XCOLAB_HOME=$(pwd)"/../"

<<COMMENT1
#deploy service layer
cd $XCOLAB_HOME/services/plansProposalsFacade/plansProposalsFacade-portlet-service
mvn clean compile package install

cd $XCOLAB_HOME/services/plansProposalsFacade/plansProposalsFacade-portlet
mvn clean compile package liferay:deploy -DskipTests=true

#deploy all other portlets
cd $XCOLAB_HOME/portlets
for D in *; do
	if [ -d "${D}" ]; then
		cd $D
        mvn compile package liferay:deploy
        cd ..
	fi;
done
COMMENT1

#run tests
cd $XCOLAB_HOME/scripts
./jenkins-run-junit-tests.sh
