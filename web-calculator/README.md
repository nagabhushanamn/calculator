


# Install java

	sudo yum install java-1.8.0-openjdk.x86_64
    java -version
    sudo update-alternatives --config java

# Install Jenkins

	sudo wget -O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat/jenkins.repo
	sudo rpm --import https://jenkins-ci.org/redhat/jenkins-ci.org.key
	sudo yum install jenkins
	
	sudo service jenkins start/stop/restart
	sudo chkconfig jenkins on
	
# 	Jenkins hello world

Click on New Item.
Enter hello world as the item name, choose Pipeline, and click on OK.
There are a lot of options. We will skip them for now and go directly to the Pipeline section.
There, in the Script textbox, we can enter the pipeline script:

	
	pipeline {
       agent any
       stages {
        stage("Hello") {
         steps {
              echo 'Hello World'
         }
        }
       }
	  }
	  
	  
# Jenkins architecture

	  
	  







