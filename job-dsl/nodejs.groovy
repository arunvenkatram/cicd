job(Nodejs Example) {
	scm {
		git('https://github.com/arunvenkatram/docker-demo.git') {
		node / gitConfigName('DSL User')
		node / gitConfigEmail('arun92venkat@gmail.com')
		}
	}
	triggers {
	scm('H/5 * * * *')

}
	wrappers {
	nodejs('nodejs') // name of nodejs installation.
}

	steps {
	shell('npm install')
}
}
