Juegos Panamericanos - Registro de Atletas y Disciplinas
Desarrollador
Nombre: Zihao Xiao
Descripción General
Este repositorio contiene una solución para el registro de atletas y disciplinas en el contexto de los Juegos Panamericanos. El sistema permite la gestión de atletas, disciplinas, equipos y eventos, manteniendo un control interno de los participantes y sus actividades.

Clases Principales
1. Atleta
   Atributos:

nombre: String
país: String
edad: int
disciplinas: List<Disciplina>
Métodos:

agregarDisciplina(d: Disciplina)
eliminarDisciplina(d: Disciplina)
mostrarInformacion()
2. Disciplina
   Atributos:

nombre: String
numParticipantes: int
recordMundial: String
Métodos:

mostrarInformacion()
3. Equipo
   Atributos:

nombre: String
atletas: List<Atleta>
disciplina: Disciplina
Métodos:

agregarAtleta(a: Atleta)
eliminarAtleta(a: Atleta)
mostrarInformacion()
4. Evento
   Atributos:

disciplina: Disciplina
equipos: List<Equipo>
fecha: Date
Métodos:

agregarAtletaEquipo(a: Atleta, e: Equipo)
eliminarAtletaEquipo(a: Atleta, e: Equipo)
mostrarInformacion()
Relaciones Principales
Atleta - Disciplina:

Un atleta puede utilizar una o más disciplinas.
Una disciplina puede ser utilizada por muchos atletas.
Atleta - Equipo:

Un atleta puede ser parte de uno o más equipos.
Un equipo se compone de uno o más atletas.
Disciplina - Equipo:

Un equipo está asociado a una disciplina específica.
Una disciplina puede estar asociada a uno o más equipos.
Evento - Disciplina:

Un evento está asociado a una disciplina.
Una disciplina puede estar asociada a uno o más eventos.
Evento - Equipo:

Un equipo puede estar involucrado en uno o más eventos.
Un evento puede involucrar a uno o más equipos.
Evento - Atleta:

Un atleta puede estar involucrado en uno o más eventos.
Un evento puede involucrar a uno o más atletas.


prompt:

