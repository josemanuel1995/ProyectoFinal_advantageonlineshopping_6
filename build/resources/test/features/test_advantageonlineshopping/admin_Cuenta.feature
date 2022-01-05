@test
Feature: administrar mi cuenta

  Yo como usuario
  Quiero poder administrar mi cuenta.

  Background: el usuario esta en la pagina de MY ACCOUNT
    Given el usuario se encuentra logueado e ingresa en la pagina principal

  #Escenarios Positivos
  Scenario Outline: Deberia editar la cuenta cuando completa correctamente el formulario
    When el usuario completa el formulario
      | email   | oldPassword   | newpassword  | confirmNewPassword   | firstName   | lastName   | phoneNumber   | country   | city   | address   | state   | postalCode   |
      | <email> | <oldPassword> | <newpassword>| <confirmNewPassword> | <firstName> | <lastName> | <phoneNumber> | <country> | <city> | <address> | <state> | <postalCode> |
    Then el usuario da clic en SAVE

    Examples:
      |             email            | oldPassword   | newpassword  | confirmNewPassword   | firstName | lastName | phoneNumber | country  | city      | address         | state    | postalCode |
     # Escenario Positivo:  con todos los datos correctos
      | araujomanuelsaxo@gmail.com | Mde%42fggre | Mde%42fggre  | Mde%42fggre         |  Hernandez  | Enrique  | 3194564543| Colombia | Manizales | KR 34 # 45 09   | Manizales | 209854    |

    # Escenario Negativo: Campos incorrectos segun especificaciones
  Scenario: Se deben ver los mensajes de campo incorrecto cuando el Last Name es muy largo

    When el usuario completa el formulario
      | email                        | oldPassword   | newpassword  | confirmNewPassword   | firstName | lastName                                        | phoneNumber | country | city | address | state | postalCode |
      | araujomanuelsaxo@gmail.com   | Mde%42fggre     | Mde%42fggre  | Mde%42fggre         | perez     | manuelllllllllllllllllllllllllllllllllllllllll  | 3194564543  |         |      |         |       |            |
    Then se muestran los mensajes de username invalido

        # Escenario Negativo: No conciden los password
  Scenario: Se debe ver el mensaje de campo incorrecto cuando los password no coinciden
    When el usuario completa el formulario
      | email                        | oldPassword   | newpassword  | confirmNewPassword   | firstName | lastName | phoneNumber | country | city | address | state | postalCode |
      | araujomanuelsaxo@gmail.com   | Mde%42fggrr   | Mde%42fggrr  | Mde%42fggrr          |           |          |             |         |      |         |       |            |
    Then se muestran el mensaje de password no coinciden


