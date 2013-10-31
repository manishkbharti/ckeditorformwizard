modules = {
    application {
        resource url: 'js/application.js'
    }

    formwizard {
        dependsOn 'jquery'
        resource url: 'js/jquery.form.wizard.min.js'
    }

    cvsurgeon {
        dependsOn 'jquery'
        /*resource url: 'css/cvsurgeon/bootstrap.min.css'
        resource url: 'css/cvsurgeon/bootstrap-responsive.min.css'
        resource url: 'css/cvsurgeon/jquery-ui.css'
        resource url: 'css/cvsurgeon/jquery.ui.theme.css'*/
        resource url: 'css/cvsurgeon/style.css'
        /*resource url: 'css/cvsurgeon/jquery.gritter.css'
        resource url: 'css/cvsurgeon/themes.css'
        resource url: 'css/cvsurgeon/extend.css'
        resource url: 'css/cvsurgeon/pageguide.css'
        resource url: 'css/cvsurgeon/jquery.easy-pie-chart.css'
        resource url: 'css/cvsurgeon/all.css'*/

//        resource url: 'js/cvsurgeon/jquery.nicescroll.min.js', disposition: 'defer'
//        resource url: 'js/cvsurgeon/jquery.imagesloaded.min.js', disposition: 'defer'

//        resource url: 'js/cvsurgeon/jquery.ui.core.min.js', disposition: 'defer'
        resource url: 'js/cvsurgeon/jquery.ui.widget.min.js', disposition: 'defer'
        resource url: 'js/cvsurgeon/jquery.ui.mouse.min.js', disposition: 'defer'

//        resource url: 'js/cvsurgeon/jquery.ui.resizable.min.js', disposition: 'defer'
//        resource url: 'js/cvsurgeon/jquery.ui.sortable.min.js', disposition: 'defer'

        resource url: 'js/cvsurgeon/bootstrap.min.js', disposition: 'defer'

//        resource url: 'js/cvsurgeon/jquery.bootbox.js', disposition: 'defer'
//        resource url: 'js/cvsurgeon/jquery.validate.min.js', disposition: 'defer'
//        resource url: 'js/cvsurgeon/additional-methods.min.js', disposition: 'defer'

        resource url: 'js/cvsurgeon/eakroko.min.js', disposition: 'defer'

//        resource url: 'js/cvsurgeon/application.js', disposition: 'defer'
//        resource url: 'js/cvsurgeon/demonstration.min.js', disposition: 'defer'
//        resource url: 'js/cvsurgeon/jquery.touch-punch.min.js', disposition: 'defer'

        resource url: 'js/cvsurgeon/jquery.ui.spinner.js', disposition: 'defer'
        resource url: 'js/cvsurgeon/jquery.ui.slider.js', disposition: 'defer'

//        resource url: 'js/cvsurgeon/jquery.icheck.min.js', disposition: 'head'
//        resource url: 'js/cvsurgeon/ajax-tooltip.js', disposition: 'head'
//        resource url: 'js/cvsurgeon/ajax.js', disposition: 'head'
//        resource url: 'js/cvsurgeon/ajax-dynamic-content.js', disposition: 'head'
//        resource url: 'js/cvsurgeon/jquery.slimscroll.min.js', disposition: 'defer'
//        resource url: 'js/cvsurgeon/jquery.easy-pie-chart.min.js', disposition: 'defer'
//        resource url: 'js/cvsurgeon/jquery.ui.draggable.min.js', disposition: 'defer'
//        resource url: 'js/cvsurgeon/jquery.gritter.min.js', disposition: 'defer'

        resource url: 'js/cvsurgeon/jquery.form.wizard.min.js', disposition: 'defer'
    }
}