<script type="text/javascript">
    <ckeditor:config var="toolbar_Mytoolbar">
    [
        [ 'Bold', 'Italic', 'Underline', 'Scayt' ]
    ]
    </ckeditor:config>

    delete CKEDITOR.instances['${name}'];
    CKEDITOR.config.scayt_autoStartup = true;
    CKEDITOR.config.fillEmptyBlocks = false;

    function CKupdate() {
        for (instance in CKEDITOR.instances) {
            CKEDITOR.instances[instance].updateElement();
        }
    }

</script>
<ckeditor:editor name="${name}" height="100px" width="98%" toolbar="Mytoolbar">
    <g:if test="${summary}">
        ${summary}
    </g:if>
</ckeditor:editor>