package com.daggerok

import com.daggerok.domain.User
import com.daggerok.domain.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import java.util.stream.Stream

fun main(args: Array<String>) {
    SpringApplication.run(KtbootApplication::class.java, *args)
}

@SpringBootApplication
open class KtbootApplication {

    @Bean
    open fun objectMapperBuilder(): Jackson2ObjectMapperBuilder = Jackson2ObjectMapperBuilder()

    @Bean
    open fun init(userRepository: UserRepository) = CommandLineRunner {
        Stream.of("one", "two", "three")
                .forEach { it -> userRepository.save(User(it)) }

        userRepository.findByName("two").forEach { println(it) }
    }
}
