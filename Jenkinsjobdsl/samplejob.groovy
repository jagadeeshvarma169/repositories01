job('example') {
   scm {
     github( 'jenkinsci/job-dsl-plugin', 'main')
    }
    triggers {
        githubpush()
    }
    steps {
        gradle('clean build')
    }
}