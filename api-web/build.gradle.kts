dependencies {
    api("io.springfox:springfox-boot-starter:3.0.0")
    implementation(project(":api-core"))
    implementation(project(":api-domain"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}