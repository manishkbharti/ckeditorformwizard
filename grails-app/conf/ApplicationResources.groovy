modules = {
    application {
        resource url: 'js/application.js'
    }

    formwizard {
        dependsOn 'jquery'
        resource url: 'css/style.css'

        resource url: 'js/jquery.ui.widget.min.js', disposition: 'defer'
        resource url: 'js/jquery.ui.mouse.min.js', disposition: 'defer'
        resource url: 'js/bootstrap.min.js', disposition: 'defer'
        resource url: 'js/eakroko.min.js', disposition: 'defer'
        resource url: 'js/jquery.ui.spinner.js', disposition: 'defer'
        resource url: 'js/jquery.ui.slider.js', disposition: 'defer'
        resource url: 'js/jquery.form.wizard.min.js', disposition: 'defer'
    }
}