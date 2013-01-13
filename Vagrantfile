Vagrant::Config.run do |config|
  config.vm.box = "heroku"
  config.vm.box_url = "/Volumes/MyBack/VMs/VagrantBoxes/heroku.box"

  config.vm.network :hostonly, "33.33.33.11"
  config.vm.provision :shell, :inline => "sudo apt-get update"
  config.vm.provision :shell, :inline => "sudo apt-get -y install openjdk-6-jre-headless unzip"
  config.vm.provision :shell, :inline => "cd /tmp ; wget http://download.playframework.org/releases/play-2.0.4.zip ; sudo -u vagrant unzip play-2.0.4.zip -d /home/vagrant ; echo export PATH=\$PATH:/home/vagrant/play-2.0.4/ >> /home/vagrant/.bashrc"
end
