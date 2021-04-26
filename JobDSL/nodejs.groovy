job ('job example for npm')
{
scm {
    git('https://github.com/kulikp/testnodejs.git') { node ->
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
    shell("node app.js")
    }
}

