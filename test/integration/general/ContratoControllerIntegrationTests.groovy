package general

import static org.junit.Assert.*
import org.junit.*


class ContratoControllerIntegrationTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testSomething() {
//save
	def controller = new ContratoController()

	controller.params.folio = 'TEST'

	controller.save()
	
	def contrato = Contrato.findByNombre('TEST')
	assert contrato
//edit
	controller.params.id = contrato.id
	controller.params.folio = 'TEST MOD'
	controller.save()

	assert Contrato.find(contrato.id).folio == 'TEST MOD'
	
//delete
	controller.params.id = seguro.id
	controller.delete()
	
	assert null == Contrato.findByFolio('TEST MOD')

	
		
    }
	
	
}
