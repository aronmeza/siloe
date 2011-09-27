
class ContratoFunctionalTests extends functionaltestplugin.FunctionalTestCase{
	void testContrato(){
	get('/contrato/create')
	assertStatus 200

	form{
	folio = 'test'
	click "Create"
	}

	assertStatus 200
	assertContentContains "New"
	}

	void testContratoEdita(){
	get('/contrato/edit/23')
	assertStatus 200
	
	form{
	folio = 'test modificado'
	click "Update"
	}
	
	assertStatus 200
	assertContentContains "Update"
	
	}
/* solo usar con un id que se conozca...	
	void testContratoElimina(){
	get('/contrato/edit/20')
	assertStatus 200
	
	form{
	click "Delete"
	}

	assertStatus 200
	assertContentContains "Deleted"
	}
*/	

}
