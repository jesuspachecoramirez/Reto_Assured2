# new feature
# Tags: optional

Feature: CovidTracking
  Como usuario de la pagina
  deseo obtener informacion referente al covid
  para poder estar informado sobre la situacion de la problematica

  Scenario:Validar informacion por fecha
    Given El usuario desea obtener informacion de una fecha especifica
    When el usuario desea conocer los casos confirmados de la fecha
    Then la pagina muestra la informacion correspondiente