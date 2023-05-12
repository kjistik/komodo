<template>
  <div class="content">
    <Navbar />
    <div class="view">
    </div>
    <div class="footer">
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
    </div>
  </div>
</template>

<script>
import Navbar from './components/Navbar.vue'
export default {
  components: {
    Navbar
  }
}
</script>

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

.view {
  min-height: calc(100vh - 140px);
  width: 100vw;
}

.footer {
  background-color: #686868;
  bottom: 0px;
  width: 100vw;
  height: 60px;
}

* {
  padding: 0;
  margin: 0;
  border: 0;
  color: white;
}

.content {
  background-color: #2C3539;
  width: 100vw;
  min-height: 100vh;

}
</style>
