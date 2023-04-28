<template>
  <div class="nav">
    <NavBar />
  </div>
</template>

<style>
.nav {
  height: 10%;
  width: 100%;
}
</style>

<script>
// @ is an alias to /src
import NavBar from '@/components/NavBar.vue';
export default {
  name: 'MainView',
  components: {
    NavBar
  }
}
</script>
b