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
	
    }

	@Test
	void testEditarSeguro(){
	def controller = new SeguroController()
	controller.params.nombre = 'TEST'
	
	controller.save()
	
	//TODO editar
	
	
	}
	
	
}
