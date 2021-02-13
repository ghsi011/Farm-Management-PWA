const CACHE_NAME = "version-1";
const URLS_TO_CACHE = ['index.html', 'offline.html'];

const self = this;

// Install SW
self.addEventListener('install', (event) => {
    event.waitUntil(
        caches.open(CACHE_NAME)
            .then((cache) => {
                console.log('Opened cache');

                return cache.addAll(URLS_TO_CACHE);
            })
    )
});
// Listen for requests from
self.addEventListener('fetch', () => {

});

// Activate the service worker
self.addEventListener('activate', () => {

});