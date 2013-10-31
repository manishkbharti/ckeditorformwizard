package formwizard

class RegisterController {

    def index() {
        render view: 'index'
    }

    def registrationFlow = {
        defaultAction {
            action {
                [data: 'test data']
            }
            on('success').to('personalDetail')
        }

        personalDetail {
            on("submit") {
                println "===================submit======================"
            }.to('careerInformation')
        }

        careerInformation {
            on('submitUnemployed') {
                println "===================submitUnemployed======================"
            }.to('finish')
        }

        finish {
            redirect controller: 'dashboard'
        }
    }
}
