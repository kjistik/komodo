<template>
  <div clas="content">
    <MainView />
    <div class="view">
      <router-view />
    </div>
    <div class="footer">
      <FooterComponent />
    </div>
  </div>
</template>

<style>
body {
  margin: 0px;
  padding: 0px;
  background-color: #333333;
}

.footer {
  position: fixed;
  bottom: 0;
  color: white;
  height: 60px;
  background-color: #2C3E50;
  width: 100%;
}

.view {
  position: absolute;
  min-height: 70%;
  width: 100%;
  margin-top: 10px;
}
</style>
<script>
import NavBar from './components/NavBar.vue';
import MainView from './views/MainView.vue';
import FooterComponent from './components/FooterComponent.vue';
export default {
  components: {
    NavBar,
    MainView,
    FooterComponent
  }

}
</script>