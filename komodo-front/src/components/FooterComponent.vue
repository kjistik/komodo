<template>
    <div class="container">
        <div></div>
        <div></div>
        <p>2023 - Komodo - Martín Ernesto Coronel</p>
        <div class="socials">
            <a href="https://www.github.com/kjistik" target="_blank">
                <img class="github" src="@/assets/github.svg">
            </a>
            <a href="https://www.linkedin.com/in/kjistik" target="_blank">
                <img class="linkedin" src="@/assets/linkedin.svg">
            </a>
        </div>
    </div>
</template>

<style>
.container {
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: space-between;
    align-items: center;
}

.socials {
    display: flex;
    justify-content: space-evenly;
    min-width: 20%;
}

.github,
.linkedin {
    width: 30px;
}
</style>