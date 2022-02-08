// Admin view
listview('Admin'){
    description('Admin')
    jobs {
        regex(/admin-./)
    }
    colums {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
// AWS
nestedview('AWS'){
    description('')
    view {
        listview('ec2'){
            description('')
            jobs {
                regex(/AWS-.*/)
            }
            colums {
                status()
                weather()
                name()
                lastSuccess()
                lastFailure()
                lastDuration()
                buildButton()
            }
        }
    }
}
