<%@ page import="general.Contrato" %>



<div class="fieldcontain ${hasErrors(bean: contratoInstance, field: 'folio', 'error')} ">
	<label for="folio">
		<g:message code="contrato.folio.label" default="Folio" />
		
	</label>
	<g:textField name="folio" value="${contratoInstance?.folio}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contratoInstance, field: 'hospital', 'error')} required">
	<label for="hospital">
		<g:message code="contrato.hospital.label" default="Hospital" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="hospital" name="hospital.id" from="${general.Hospital.list()}" optionKey="id" required="" value="${contratoInstance?.hospital?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contratoInstance, field: 'seguro', 'error')} required">
	<label for="seguro">
		<g:message code="contrato.seguro.label" default="Seguro" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="seguro" name="seguro.id" from="${general.Seguro.list()}" optionKey="id" required="" value="${contratoInstance?.seguro?.id}" class="many-to-one"/>
</div>

