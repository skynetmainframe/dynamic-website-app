#!/bin/bash

# Update system packages
sudo yum update -y

# Install Docker
sudo yum install docker -y

# Start and enable Docker service
sudo systemctl start docker
sudo systemctl enable docker

# Add ec2-user to the docker group
sudo usermod -aG docker ec2-user
