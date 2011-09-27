
class SeguroFunctionalTests extends functionaltestplugin.FunctionalTestCase{
	void testSeguro(){
	get('/seguro/create')
	assertStatus 200

	form{
	nombre = 'test'
	click "Create"
	}

	assertStatus 200
	assertContentContains "New"
	}

	void testSeguroEdita(){
	get('/seguro/edit/21')
	assertStatus 200
	
	form{
	nombre = 'test modificado'
	click "Update"
	}
	
	assertStatus 200
	assertContentContains "Update"
	
	}
/* solo usar con un id que se conozca...	
	void testSeguroElimina(){
	get('/seguro/edit/20')
	assertStatus 200
	
	form{
	click "Delete"
	}

	assertStatus 200
	assertContentContains "Deleted"
	}
*/	

}
