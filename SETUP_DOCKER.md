#1 Install docker
    https://docs.docker.com/engine/installation/linux/ubuntulinux/

#2 Setup docker remote api.
* Edit /etc/default/docker
update DOCKER_OPTS='-H tcp://0.0.0.0:4243 -H unix:///var/run/docker.sock'
* Restart docker service
sudo service docker restart     