#1. Setup docker remote api.
* Edit /etc/init/docker.conf
update DOCKER_OPTS='-H tcp://0.0.0.0:4243 -H unix:///var/run/docker.sock'
* Restart docker service
sudo service docker restart     