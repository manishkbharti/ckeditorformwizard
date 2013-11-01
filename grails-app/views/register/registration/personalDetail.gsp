<%@ page contentType="text/html;charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <meta name="layout" content="main">
    <title>Test</title>
    <r:require module="formwizard"/>
    <ckeditor:resources/>
</head>

<body>

<div class="box box-color box-bordered">
    <div class="box-title">
        <h3>Vertical steps</h3>
    </div>

    <div class="box-content nopadding">
        <g:form method="POST" class="form-horizontal form-wizard wizard-vertical form-validate" controller="register" action="registration" name="test" autocomplete='off'>

            <div class="step" id="firstStep">
                <ul class="wizard-steps steps-3">
                    <li class='active'>
                        <div class="single-step">
                            <span class="title">1</span>
                            <span class="circle">
                                <span class="active"></span>
                            </span>
                            <span class="description">
                                Basic information
                            </span>
                        </div>
                    </li>
                    <li>
                        <div class="single-step">
                            <span class="title">2</span>
                            <span class="circle">
                            </span>
                            <span class="description">
                                Advanced information
                            </span>
                        </div>
                    </li>
                </ul>

                <div class="form-content">
                    <g:render template="/textEditor/textEditor" model="[name: 'asd1']"/>
                    %{--<div class="control-group">
                        <label for="firstname" class="control-label">First name</label>

                        <div class="controls">
                            <input type="text" name="firstname" id="firstname" class="input-xlarge">
                        </div>
                    </div>

                    <div class="control-group">
                        <label for="anotherelem" class="control-label">Last name</label>

                        <div class="controls">
                            <input type="text" name="anotherelem" id="anotherelem" class="input-xlarge">
                        </div>
                    </div>

                    <div class="control-group">
                        <label for="additionalfield" class="control-label">Additional information</label>

                        <div class="controls">
                            <input type="text" name="additionalfield" id="additionalfield" class="input-xlarge">
                        </div>
                    </div>--}%
                </div>
            </div>

            <div class="step" id="secondStep">
                <ul class="wizard-steps steps-3">
                    <li>
                        <div class="single-step">
                            <span class="title">1</span>
                            <span class="circle">
                            </span>
                            <span class="description">
                                Basic information
                            </span>
                        </div>
                    </li>
                    <li class='active'>
                        <div class="single-step">
                            <span class="title">
                                2</span>
                            <span class="circle">
                                <span class="active"></span>
                            </span>
                            <span class="description">
                                Advanced information
                            </span>
                        </div>
                    </li>
                </ul>

                <div class="form-content">
                    <g:render template="/textEditor/textEditor" model="[name: 'asd']"/>

                    %{--<div class="control-group">
                        <label for="text" class="control-label">Gender</label>

                        <div class="controls">
                            <select name="gend" id="gend">
                                <option value="">-- Chose one --</option>
                                <option value="1">Male</option>
                                <option value="2">Female</option>
                            </select>
                        </div>
                    </div>

                    <div class="control-group">
                        <label for="text" class="control-label">Language</label>

                        <div class="controls">
                            <select name="gend" id="gend">
                                <option value="">-- Chose one --</option>
                                <option value="1">German</option>
                                <option value="2">English</option>
                            </select>
                        </div>
                    </div>

                    <div class="control-group">
                        <label for="text" class="control-label">Accept policy</label>

                        <div class="controls">
                            <label class="checkbox"><input type="checkbox" name="policy" value="agree"> I agree the policy.</label>
                        </div>
                    </div>--}%
                </div>
            </div>

            <div class="form-actions">
                <input type="reset" class="btn" value="Back" id="back">
                <g:submitButton name="submit" class="btn btn-primary" value="Submit"/>
            </div>
        </g:form>
    </div>
</div>
</body>
</html>