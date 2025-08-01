#!/bin/bash

# Install Docker Compose
sudo curl -L "https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose

# Verify Docker Compose installation
docker-compose version

# Install Java and Maven
sudo yum install java-17-amazon-corretto-devel -y
sudo yum install maven -y

# Verify Java and Maven installation
java -version
mvn -v

# Install NVM, Node.js, and Angular CLI
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.7/install.sh | bash
export NVM_DIR="$HOME/.nvm"
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"
[ -s "$NVM_DIR/bash_completion" ] && \. "$NVM_DIR/bash_completion"

nvm install 20
nvm use 20
npm install -g @angular/cli

# Verify Node.js and Angular CLI installation
node -v
npm -v
ng version
