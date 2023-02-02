package com.example.customprofileapp

data class User(
    val name: String,
    val age: Int,
    val city: String,
    val email: String,
    val photos: MutableList<Photo>,
    val curiosities: MutableList<Curiosity>
)

data class Photo(
    val image: String,
    val description: String
)

data class Curiosity(
    val title: String,
    val description: String
)

fun getUser(): User {
    return User(
        name = "Marcos Henrique",
        age = 24,
        city = "Manaus",
        email = "marcos@gmail.com",
        photos = mutableListOf(
            Photo(
                image = "https://img.freepik.com/fotos-gratis/a-paisagem-bonita-do-sol-da-praia-com-um-barco_1112-212.jpg?w=2000",
                description = "Image 1"
            ),
            Photo(
                image = "https://annphoto.net/wp-content/uploads/2021/06/7-dicas-para-fotografia-de-paisagem-colorida-780x470.jpg",
                description = "Image 2"
            ),
            Photo(
                image = "https://img.freepik.com/fotos-gratis/foto-de-grande-angular-de-uma-unica-arvore-crescendo-sob-um-ceu-nublado-durante-um-por-do-sol-cercado-por-grama_181624-22807.jpg?w=2000",
                description = "Image 3"
            ),
            Photo(
                image = "https://thumbs.dreamstime.com/b/paisagens-coloridas-do-cen%C3%A1rio-da-queda-46641435.jpg",
                description = "Image 4"
            ),
            Photo(
                image = "https://intentos.com.br/wp-content/uploads/2020/06/o-que-e-fotografia-de-paisagem-1024x666.jpeg",
                description = "Image 5"
            ),
        ),
        curiosities = mutableListOf(
            Curiosity(
                title = "Curiosity 1",
                description = "Description 1"
            ),
            Curiosity(
                title = "Curiosity 2",
                description = "Description 2"
            ),
            Curiosity(
                title = "Curiosity 3",
                description = "Description 3"
            ),
            Curiosity(
                title = "Curiosity 4",
                description = "Description 4"
            ),
            Curiosity(
                title = "Curiosity 5",
                description = "Description 5"
            ),
        ),
    )
}
