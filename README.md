# Implementación de Patrones GRASP en un Sistema de Gestión de Tareas

El equipo de desarrollo de una empresa de software necesita mejorar la estructura y mantenibilidad de un sistema de gestión de tareas. El sistema debe permitir a los usuarios crear, editar, eliminar y marcar tareas como completadas. Además, debe ser escalable y fácil de mantener. Para lograrlo, se deben aplicar al menos dos patrones GRASP en el diseño y desarrollo del sistema.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Aplicación de Patrones GRASP en el Desarrollo de Sistemas |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración y Modelado Inicial

**Objetivo:** Identificar los componentes clave del sistema y aplicar el patrón 'Experto en Información' para asignar responsabilidades.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los principales componentes del sistema de gestión de tareas.
- Aplica el patrón 'Experto en Información' para decidir qué componente debe manejar la información de las tareas.

**Entregable:** Diagrama de componentes con responsabilidades asignadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la información que cada componente necesita manejar.
- Reflexiona sobre cómo la asignación de responsabilidades afecta la cohesión y el acoplamiento.

</details>

### Fase 2: Implementación del Patrón 'Creador'

**Objetivo:** Aplicar el patrón 'Creador' para gestionar la creación de tareas.

**Tiempo estimado:** 1.5 horas

**Instrucciones:**

- Identifica el componente responsable de crear nuevas tareas.
- Aplica el patrón 'Creador' para centralizar la lógica de creación de tareas en ese componente.

**Entregable:** Componente 'Creador' implementado y funcionando.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre cómo centralizar la lógica de creación mejora la mantenibilidad.
- Considera los posibles edge cases al crear tareas.

</details>

### Fase 3: Aplicación del Patrón 'Alta Cohesión y Bajo Acoplamiento'

**Objetivo:** Refactorizar el sistema para mejorar la cohesión y reducir el acoplamiento.

**Tiempo estimado:** 1.5 horas

**Instrucciones:**

- Analiza la estructura actual del sistema y identifica áreas de baja cohesión y alto acoplamiento.
- Aplica el patrón 'Alta Cohesión y Bajo Acoplamiento' para refactorizar el sistema.

**Entregable:** Sistema refactorizado con alta cohesión y bajo acoplamiento.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre cómo la cohesión y el acoplamiento afectan la mantenibilidad y escalabilidad del sistema.
- Considera el impacto de los cambios en la estructura del sistema.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es el patrón 'Experto en Información' y cómo se aplica en el sistema de gestión de tareas?
- **paraQueSirve**: ¿Para qué sirve el patrón 'Creador' en el contexto del sistema de gestión de tareas?
- **comoSeUsa**: ¿Cómo se usa el patrón 'Alta Cohesión y Bajo Acoplamiento' para mejorar la estructura del sistema?
- **erroresComunes**: ¿Cuáles son los errores comunes al aplicar el patrón 'Creador' y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la aplicación del patrón 'Alta Cohesión y Bajo Acoplamiento' en el sistema?

## Criterios de Evaluacion

- Identificación correcta de los componentes clave del sistema.
- Aplicación efectiva del patrón 'Experto en Información'.
- Implementación del patrón 'Creador' con manejo de edge cases.
- Refactorización del sistema para lograr alta cohesión y bajo acoplamiento.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
