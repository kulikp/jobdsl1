job ('job-example-for-npm')
{
scm {
    git('https://github.com/kulikp/jobdsl1.git') { node ->
    node / gitConfigName('DSL script')
    node / gitConfigEmail('jenkins-dsl-script@test.com')
    }
}



triggers {
    scm('H/5 * * * *')
}



wrappers {
    nodejs('nodejs')
}



steps {
    shell("npm test")
    }
}

