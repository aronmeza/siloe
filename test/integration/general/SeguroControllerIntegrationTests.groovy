package general

import static org.junit.Assert.*
import org.junit.*


class SeguroControllerIntegrationTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testGuardarSeguro() {
	def controller = new SeguroController()

	controller.params.nombre = 'TEST'

	controller.save()
	
	def seguro = Seguro.findByNombre('TEST')
	assert seguro
//edit
	controller.params.id = seguro.id
	controller.params.nombre = 'TEST MOD'
	controller.save()

	assert Seguro.find(seguro.id).nombre == 'TEST MOD'
	
//delete
	controller.params.id = seguro.id
	controller.delete()
	
	assert null == Seguro.findByNombre('TEST MOD')

	
		
    }
	
}
