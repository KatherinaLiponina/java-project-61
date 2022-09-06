run-dist: ./app/build/install/app/bin/app
	./app/build/install/app/bin/app
./app/build/install/app/bin/app: 
	gradle installDist
clean:
	gradle clean
