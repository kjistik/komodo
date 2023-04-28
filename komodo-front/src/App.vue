<template>
  <div clas="content">
    <MainView />
    <div class="view">
      <router-view />
    </div>
  </div>
</template>

<style>
body {
  margin: 0px;
  padding: 0px;
  background-color: #333333;
}


.view {
  min-height: 70%;
  width: 100%;
  margin-top: 10px;
}
</style>
<script>
import NavBar from './components/NavBar.vue';
import MainView from './views/MainView.vue'
export default {
  components: {
    NavBar,
    MainView
  }

}
</script>