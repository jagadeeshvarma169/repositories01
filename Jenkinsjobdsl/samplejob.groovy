job('example') {
   scm {
     github( 'jenkinsci/job-dsl-plugin', 'master')
    }
    triggers {
        githubpush()
    }
    steps {
        gradle('clean build')
    }
}
