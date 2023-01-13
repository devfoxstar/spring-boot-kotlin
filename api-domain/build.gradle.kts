dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.mariadb.jdbc:mariadb-java-client:2.7.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    kapt("org.springframework.boot:spring-boot-configuration-processor")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}