#/bin/bash

sudo apt update
yes y | sudo apt upgrade
sudo apt install wget
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
sudo dpkg -i google-chrome-stable_current_amd64.deb
apt-get install -f
google-chrome
