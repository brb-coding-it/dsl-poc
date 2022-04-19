def gitUrl = "https://github.com/brb-coding-it/dsl-poc.git"

job("dsl-build") {
    description "Builds jobs from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }
    scm {
        git {
            remote {
                url gitUrl
                branch "origin/main"
            }
        }
    }
    steps {
        shell "Look: I'm building main!"
    }
}
