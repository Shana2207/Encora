Feature: Como usuario quiero probar las funcionalidades de registro y logeo

@prueba1
  Scenario Outline: Verificar el registro de usuario
    Given se abre la pagina web
    When el usuario selecciona registrar
    And el usuario llena el campo "<nombre>", "<apellido>"
    And el usuario llena el campo direccion "<direccion>"
    And el usuario llena el campo ciudad "<ciudad>"
    And el usuario llena el campo provincia "<provincia>"
    And el usuario llena el campo codigo postal "<codigo>"
    And el usuario llena el campo telefono "<telefono>"
    And el usuario llena el campo ssn "<ssn>"
    And el usuario llena el campo username "<username>"
    And el usuario llena el campo password "<password>"
    And el usuario llena el campo confirmar password "<confpassword>"
    And el usuario selecciona enviar
    Then el texto buscado es "<resul>"
    Examples:
      | nombre      | apellido   | telefono   | ssn          | direccion           | ciudad   | provincia   | codigo  | username | password | confpassword| resul |
      | Nayelly     | Valenzuela |  964926164 | 987654321 | calle lima 123      | lima     | Lima        | 11001   | naye12345     | Clave123 | Clave123    | Your account was created successfully. You are now logged in.  |


@prueba2
  Scenario Outline: Realizar logeo de usuario
    Given se abre la pagina web
    When el usuario esta registrado
    And el usuario se logea "<username>", "<password>"
    Then el usuario selecciona ingresar
    Examples:
    | username | password |
    | naye12345     | Clave123 |

