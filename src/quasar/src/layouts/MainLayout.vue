<template>
  <q-layout view="lHh Lpr lFf">
    <q-header elevated>
      <q-toolbar class="bg-gradient">
        <div>
            <q-toolbar-title class="gt-sm"> 
              <q-tabs v-model="tab" align="left">
                <q-tab name="portal_cliente" label="Portal do Cliente" />
                <q-tab name="portal_colaborador" label="Portal do Colaborador" />
                <q-tab name="trabalhe_conosco" label="Trabalhe Conosco" />
                <q-tab name="baixe_sgh" label="Baixe o SGH" />
              </q-tabs>
           </q-toolbar-title>

          <div class="lt-md">
            <q-btn
              flat
              dense
              round
              icon="menu"
              aria-label="Menu"
              @click="leftDrawerOpen = !leftDrawerOpen"
            />
          </div>
        </div>

        <q-space /> 
          
          <div class="justify-end">
            <q-btn class="icon" icon="public"/> 
            <q-btn class="icon" icon="rss_feed"/>
            <q-btn class="icon" icon="favorite"/>
          </div>
      </q-toolbar>

      <div class="q-pa-md">
        <div class="row">
          <div class="col col-md-2">
            <img
              alt="Quasar logo"
              src="~assets/logospdata.png"
            >
          </div>
          <div class="col-6 col-md-10">
              <q-tabs v-model="tab" align="center">
                <q-tab class="header" name="home" label="Home" />
                <q-tab class="header" name="empresa" label="Empresa" />
                <q-tab class="header" name="solucoes" label="Modulos SGH" />
                <q-tab class="header" name="servicos" label="Serviços" />
                <q-tab class="header" name="cursos" label="Cursos" />
                <q-tab class="header" name="portarias" label="Portarias" />
                <q-tab class="header" name="contato" label="Contato" />
                <q-tab class="header" name="blog" label="Blog" />
              </q-tabs>
          </div>
        </div>
      </div> 



      
                 
    </q-header>    
    <q-page-container>            
      <router-view />
    </q-page-container>    
  </q-layout>
</template>

<script>
import EssentialLink from 'components/EssentialLink.vue'

const linksData = [
  {
    title: 'Docs',
    caption: 'quasar.dev',
    icon: 'school',
    link: 'https://quasar.dev'
  },
  {
    title: 'Github',
    caption: 'github.com/quasarframework',
    icon: 'code',
    link: 'https://github.com/quasarframework'
  },
  {
    title: 'Discord Chat Channel',
    caption: 'chat.quasar.dev',
    icon: 'chat',
    link: 'https://chat.quasar.dev'
  },
  {
    title: 'Forum',
    caption: 'forum.quasar.dev',
    icon: 'record_voice_over',
    link: 'https://forum.quasar.dev'
  },
  {
    title: 'Twitter',
    caption: '@quasarframework',
    icon: 'rss_feed',
    link: 'https://twitter.quasar.dev'
  },
  {
    title: 'Facebook',
    caption: '@QuasarFramework',
    icon: 'public',
    link: 'https://facebook.quasar.dev'
  },
  {
    title: 'Quasar Awesome',
    caption: 'Community Quasar projects',
    icon: 'favorite',
    link: 'https://awesome.quasar.dev'
  }
];

export default {
  name: 'MainLayout',
  components: { EssentialLink },
  data () {
    return {
      leftDrawerOpen: false,
      essentialLinks: linksData
    }
  }
}
</script>
