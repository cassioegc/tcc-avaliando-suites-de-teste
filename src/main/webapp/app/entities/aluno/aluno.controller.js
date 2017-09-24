(function() {
    'use strict';

    angular
        .module('tccmanagerApp')
        .controller('AlunoController', AlunoController);

    AlunoController.$inject = ['Aluno'];

    function AlunoController(Aluno) {

        var vm = this;

        vm.alunos = [];

        loadAll();

        function loadAll() {
            Aluno.query(function(result) {
                vm.alunos = result;
                vm.searchQuery = null;
            });
        }
    }
})();
