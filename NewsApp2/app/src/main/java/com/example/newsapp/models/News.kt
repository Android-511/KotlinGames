package com.example.newsapp.models

import java.sql.Date

data class News(
    val id: Int,
    val title : String,
    val description :String,
    val image : String,
    val date : Date
)

val newsList = listOf(
    News(
        id = 1,
        title = "El presidente de EE.UU. no muestra signos de arrepentimiento...",
        description = "Las últimas actualizaciones sobre la postura del presidente de EE.UU...",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/TrumpPortrait.jpg/800px-TrumpPortrait.jpg",
        date = Date(1739145600000L)
    ),
    News(
        id = 2,
        title = "Bañarse en la piscina del desierto de Cleopatra",
        description = "Explorando las maravillas naturales de Egipto...",
        image = "https://oem.com.mx/diariodequeretaro/img/18751754/1664355593/BASE_LANDSCAPE/1200/Cleopatra.jpg",
        date = Date(1707615600000L)
    ),
    News(
        id = 3,
        title = "Gigantes tecnológicos presentan nuevos modelos de IA",
        description = "Las principales empresas de tecnología compiten por desarrollar la IA más avanzada...",
        image = "https://www.tarlogic.com/wp-content/uploads/2023/09/riesgos-seguridad-IA-3.jpg",
        date = Date(1707615600000L)
    ),
    News(
        id = 4,
        title = "El rover de Marte envía impresionantes imágenes",
        description = "El último rover de la NASA ha capturado imágenes asombrosas del paisaje marciano...",
        image = "https://www.latercera.com/resizer/v2/RO76QH6WSBGDVFFFDRBML6WNBI.jpg?quality=80&smart=true&auth=af0b60c72624f0449cef3e81bf71374fb3b872d76ff9a0597ac669006190de63&width=1200&height=750",
        date = Date(1707615600000L)
    ),
    News(
        id = 5,
        title = "Descubrimiento de una antigua ciudad sumergida",
        description = "Arqueólogos han encontrado los restos de una civilización perdida bajo el océano...",
        image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9OP5Mlckj31Qbbt-mBgqQD7sX8GhlHSAxlA&s",
        date = Date(1707615600000L)
    )
)
